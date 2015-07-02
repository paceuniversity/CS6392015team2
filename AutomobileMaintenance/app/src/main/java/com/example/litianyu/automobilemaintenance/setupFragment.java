package com.example.litianyu.automobilemaintenance;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * The xml button id is "remote_image". When it is clicked it needs to do the following:
 * ImageDownloader imageDownloader = new ImageDownloader();
 imageDownloader.execute("https://raw.githubusercontent.com/paceuniversity/CS6392015team2/master/chrysler.png");
 *
 * and then put the downloaded image into the xml imageView called viewImage
 */
public class setupFragment extends Fragment implements View.OnClickListener {

    public setupFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_setup, container, false);

        Button remote_image_button = (Button)rootView.findViewById(R.id.remote_image);
        remote_image_button.setOnClickListener(this);


        return rootView;
    }


    public void onClick(View v) {

        ImageDownloader imageDownloader = new ImageDownloader();
        imageDownloader.execute("https://raw.githubusercontent.com/paceuniversity/CS6392015team2/master/chrysler.png");

    }





    private class ImageDownloader
            extends AsyncTask<String, Integer, Bitmap> {
        protected void onPreExecute() {
            //Setup is done here
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            //TODO Auto-generated method stub
            try {
                URL url = new URL(params[0]);
                HttpURLConnection httpCon =
                        (HttpURLConnection) url.openConnection();
                if (httpCon.getResponseCode() != 200)
                    throw new Exception("Failed to connect");
                InputStream is = httpCon.getInputStream();
                return BitmapFactory.decodeStream(is);
            } catch (Exception e) {

                Log.e("Image", "Failed to load image", e);
            }
            return null;
        }

        protected void onProgressUpdate(Integer... params) {
            //Update a progress bar here, or ignore it, it's up to you
        }

        protected void onPostExecute(Bitmap img) {

            ImageView iv = (ImageView) getView().findViewById(R.id.viewImage);
                if (iv != null && img != null) {
                    iv.setImageBitmap(img);
                }
            }

       }

        protected void onCancelled() {
        }
    }

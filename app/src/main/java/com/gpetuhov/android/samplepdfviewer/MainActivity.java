package com.gpetuhov.android.samplepdfviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    public static final String SAMPLE_PDF = "sample.pdf";
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset(SAMPLE_PDF)
                .enableSwipe(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .load();
    }
}
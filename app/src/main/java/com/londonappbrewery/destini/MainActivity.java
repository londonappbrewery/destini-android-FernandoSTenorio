package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;
    String inputIndex;
    private int getIndex;
    private int mStoryIndex = 1;

    private int[] mStories = {R.string.T3_Story};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIndex == 0){
                    mTextView.setText(mStories[getIndex]);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                    if(getIndex == 0){
                        mTopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mTextView.setText(R.string.T6_End);
                                mTopButton.setVisibility(View.GONE);
                                mBottomButton.setVisibility(View.GONE);

                            }
                        });
                    }
                    if (getIndex == 0){
                        mBottomButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mTextView.setText(R.string.T5_End);
                                mTopButton.setVisibility(View.GONE);
                                mBottomButton.setVisibility(View.GONE);
                            }
                        });
                    }


                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIndex == 0){
                    mTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                }if(getIndex == 0){
                    mTopButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mTextView.setText(mStories[getIndex]);
                            mTopButton.setText(R.string.T3_Ans1);
                            mBottomButton.setText(R.string.T3_Ans2);
                            if(getIndex == 0){
                                mTopButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mTextView.setText(R.string.T6_End);
                                        mTopButton.setVisibility(View.GONE);
                                        mBottomButton.setVisibility(View.GONE);

                                    }
                                });
                            }if(getIndex == 0){
                                    mBottomButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            mTextView.setText(R.string.T5_End);
                                            mTopButton.setVisibility(View.GONE);
                                            mBottomButton.setVisibility(View.GONE);
                                        }
                                    });
                            }
                        }
                    });

                }if(getIndex == 0){
                    mBottomButton.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            mTextView.setText(R.string.T4_End);
                            mTopButton.setVisibility(View.GONE);
                            mBottomButton.setVisibility(View.GONE);

                        }
                    });
                }



            }
        });

    }

    public void findFirstStory(int findStories){

        int getRighStory = mStories[getIndex];
        if (findStories == getRighStory){
            getIndex = getIndex + 1;
        }
        getIndex = mStories[findStories];
        mTextView.setText(getIndex);
        mTopButton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);

    }

    public void findSecondStory(int findStories){

        int getLeftStory = mStories[getIndex];
        if(findStories == getLeftStory){
            getIndex = getIndex + 1;
        }
        getIndex = mStories[findStories];
        //mTextView.setText();
    }
}

package com.kofigyan.stateprogressbar.listeners;

import com.kofigyan.stateprogressbar.StateProgressBar;

/**
 * Created by Mika-89 on 7/21/2021.
 */

public interface OnStateErrorListener {

    void onStateError(StateProgressBar stateProgressBar, String errorMessage);

}
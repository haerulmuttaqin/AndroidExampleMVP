package com.haerul.hitungluasmvp;

/**
 * Created by haerul on 22/02/18.
 */

public class MainPresenter {

    private MainModel model;
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void hitungLuas(int panjang, int lebar){

        int luas = luasPersegi(panjang, lebar);
        model = new MainModel(luas);
        view.tampilkanLuas(model);
    }

    private int luasPersegi(int panjang, int lebar) {
        return panjang * lebar;
    }
}

package com.incos.holamundo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class holamundo extends ApplicationAdapter {
    private SpriteBatch lapiz;
    private Texture miImagen;
    private BitmapFont miTexto;

    @Override
    public void create() {
        lapiz = new SpriteBatch();
        miImagen = new Texture("ferrari_logo.png");//para un nuevo texto
        miTexto = new BitmapFont();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        lapiz.begin();
        lapiz.draw(miImagen, 700, 550);
        miTexto.draw(lapiz, "Hola, este es mi primer juego!", 50, 200);
        lapiz.end();
    }

    @Override
    public void dispose() {
        lapiz.dispose();
        miImagen.dispose();
        miTexto. dispose();
    }
}

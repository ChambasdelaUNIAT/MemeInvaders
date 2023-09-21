package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Jugador {
    public Vector2 posicion;
    public Sprite sprite;
    public Jugador(Texture img)
    {
        sprite = new Sprite(img);
        posicion = new Vector2(Gdx.graphics.getWidth()/2,0);
        sprite.setScale(1);
    }
    public void Dibujar(SpriteBatch batch)
    {
        sprite.setPosition(posicion.x,posicion.y);
        sprite.draw(batch);
    }
}

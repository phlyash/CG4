package com.cgvsu.model;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Integer> vertexIndices;
    private List<Integer> textureVertexIndices;
    private List<Integer> normalIndices;


    public Polygon() {
        vertexIndices = new ArrayList<>();
        textureVertexIndices = new ArrayList<>();
        normalIndices = new ArrayList<>();
    }

    public void setVertexIndices(List<Integer> vertexIndices) {
        if (vertexIndices.size() < 3) {
            throw new IllegalArgumentException("Illegal number of polygon vertices: " + vertexIndices.size() + ".");
        }

        this.vertexIndices = vertexIndices;
    }

    public void setTextureVertexIndices(List<Integer> textureVertexIndices) {
        if (vertexIndices.size() < 3) {
            throw new IllegalArgumentException("Illegal number of polygon texture vertices: " + textureVertexIndices.size() + ".");
        }

        this.textureVertexIndices = textureVertexIndices;
    }

    public void setNormalIndices(List<Integer> normalIndices) {
        if (vertexIndices.size() < 3) {
            throw new IllegalArgumentException("Illegal number of normals: " + normalIndices.size() + ".");
        }

        this.normalIndices = normalIndices;
    }

    public List<Integer> getVertexIndices() {
        return vertexIndices;
    }

    public List<Integer> getTextureVertexIndices() {
        return textureVertexIndices;
    }

    public List<Integer> getNormalIndices() {
        return normalIndices;
    }

    public void offset(int index) {
        for (int i = 0; i < vertexIndices.size(); i++) {
            if (vertexIndices.get(i) > index) {
                vertexIndices.set(i, vertexIndices.get(i) - 1);
            }
        }
    }
}

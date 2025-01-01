package com.easyobj.loader;

/**
 * Provides 3D model data in a simple, OpenGL friendly format. The data is split into 4 arrays, 3 containing the
 * position, texture coordinates and normals of each vertex, and one array containing the indices making up the faces.
 * Easy-OBJ-Loaders purpose is to create this data from given OBJ files.
 */
public final class SimpleOGLVertexData {

    /**
     * The positions of all vertices, consisting of 3 values (x, y, z) each.
     */
    public final float[] vertexPositionData;

    /**
     * The texture coordinates of all vertices, consisting of 2 values (u, v) each.
     */
    public final float[] textureCoordinateData;

    /**
     * The normals of all vertices, consisting of 3 values (x, y, z) each.
     */
    public final float[] vertexNormalData;

    /**
     * The vertex indices describing the faces. All faces are triangles, thus consisting of 3 values/indices. Each
     * index can be used to retrieve the data of the vertex from the respective data array.
     */
    public final short[] faceIndexData;

    /**
     * Simply initializes the given values.
     *
     * @param vertexPositionData The array containing the vertex position data.
     * @param textureCoordinateData The array containing the texture coordinate data.
     * @param vertexNormalData The array containing the vertex normal data.
     * @param faceIndexData The array containing the face index data.
     */
    SimpleOGLVertexData(final float[] vertexPositionData,
                        final float[] textureCoordinateData,
                        final float[] vertexNormalData,
                        final short[] faceIndexData) {

        this.vertexPositionData = vertexPositionData;
        this.textureCoordinateData = textureCoordinateData;
        this.vertexNormalData = vertexNormalData;
        this.faceIndexData = faceIndexData;
    }
}

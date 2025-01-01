package com.easyobj.loader;

/**
 * The class actually loading OBJ data.
 */
public final class OBJLoader {

    /**
     * Loads OBJ data as OpenGL friendly vertex data. The given OBJ data is provided as a string.
     *
     * @param objData The OBJ data as a string.
     * @return Vertex data loaded from thr OBJ description.
     * @throws OBJLoadException When an error is encountered during the loading of the OBJ data.
     */
    public static SimpleOGLVertexData load(final String objData) throws OBJLoadException {
        throw new OBJLoadException("Loading not yet implemented!");
    }
}

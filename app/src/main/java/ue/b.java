package Ue;

import java.io.Closeable;
import livekit.org.webrtc.SurfaceTextureHelper;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final SurfaceTextureHelper f17716Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f17717Z;

    public b(SurfaceTextureHelper surfaceTextureHelper) {
        this.f17716Y = surfaceTextureHelper;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f17717Z) {
            this.f17717Z = true;
            SurfaceTextureHelper surfaceTextureHelper = this.f17716Y;
            surfaceTextureHelper.stopListening();
            surfaceTextureHelper.dispose();
        }
    }
}

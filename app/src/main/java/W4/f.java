package W4;

import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Surface f20729a;

    /* renamed from: b  reason: collision with root package name */
    public final SurfaceTexture f20730b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f20731c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f20732d;

    public f(Surface surface, SurfaceTexture surfaceTexture) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f20729a = surface;
        this.f20730b = surfaceTexture;
        this.f20731c = atomicBoolean;
        this.f20732d = reentrantLock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f20729a, fVar.f20729a) && AbstractC3557B.K(this.f20730b, fVar.f20730b) && AbstractC3557B.K(this.f20731c, fVar.f20731c) && AbstractC3557B.K(this.f20732d, fVar.f20732d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f20730b.hashCode();
        int hashCode2 = this.f20731c.hashCode();
        return this.f20732d.hashCode() + ((hashCode2 + ((hashCode + (this.f20729a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextureOESParam(surface=" + this.f20729a + ", surfaceTexture=" + this.f20730b + ", updateSurface=" + this.f20731c + ", lock=" + this.f20732d + Separators.RPAREN;
    }
}

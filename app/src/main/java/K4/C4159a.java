package k4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import id.AbstractC3557B;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: k4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4159a implements AbstractC4164f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36998a;

    public /* synthetic */ C4159a(int i10) {
        this.f36998a = i10;
    }

    @Override // k4.AbstractC4164f
    public final AbstractC4165g a(Object obj, q4.n nVar, f4.i iVar) {
        switch (this.f36998a) {
            case 0:
                return b((Uri) obj, nVar);
            case 1:
                return new C4161c((Bitmap) obj, nVar, 0);
            case 2:
                return new C4161c((ByteBuffer) obj, nVar, 1);
            case 3:
                return b((Uri) obj, nVar);
            case 4:
                return new C4161c((Drawable) obj, nVar, 2);
            case 5:
                return new C4166h((File) obj);
            default:
                return b((Uri) obj, nVar);
        }
    }

    public final AbstractC4165g b(Uri uri, q4.n nVar) {
        switch (this.f36998a) {
            case 0:
                if (!u4.e.d(uri)) {
                    return null;
                }
                return new C4160b(uri, nVar, 0);
            case 3:
                if (!AbstractC3557B.K(uri.getScheme(), "content")) {
                    return null;
                }
                return new C4160b(uri, nVar, 1);
            default:
                if (!AbstractC3557B.K(uri.getScheme(), "android.resource")) {
                    return null;
                }
                return new C4171m(uri, nVar);
        }
    }
}

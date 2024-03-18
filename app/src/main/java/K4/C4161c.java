package k4;

import H3.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import h4.q;
import java.nio.ByteBuffer;
import nf.AbstractC4825e;

/* renamed from: k4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4161c implements AbstractC4165g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37002a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.n f37003b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f37004c;

    public /* synthetic */ C4161c(Object obj, q4.n nVar, int i10) {
        this.f37002a = i10;
        this.f37004c = obj;
        this.f37003b = nVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, ji.j, ji.l] */
    @Override // k4.AbstractC4165g
    public final Object a(AbstractC4825e abstractC4825e) {
        int i10 = this.f37002a;
        boolean z10 = false;
        q4.n nVar = this.f37003b;
        Object obj = this.f37004c;
        switch (i10) {
            case 0:
                return new C4162d(new BitmapDrawable(nVar.f43869a.getResources(), (Bitmap) obj), false, h4.f.f31880Z);
            case 1:
                try {
                    ?? obj2 = new Object();
                    obj2.write((ByteBuffer) obj);
                    ((ByteBuffer) obj).position(0);
                    Context context = nVar.f43869a;
                    return new C4172n(new q(obj2, null), null, h4.f.f31880Z);
                } catch (Throwable th2) {
                    ((ByteBuffer) obj).position(0);
                    throw th2;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = u4.e.f46388a;
                if ((drawable instanceof VectorDrawable) || (drawable instanceof p)) {
                    z10 = true;
                }
                if (z10) {
                    drawable = new BitmapDrawable(nVar.f43869a.getResources(), Ad.l.b0(drawable, nVar.f43870b, nVar.f43872d, nVar.f43873e, nVar.f43874f));
                }
                return new C4162d(drawable, z10, h4.f.f31880Z);
        }
    }
}

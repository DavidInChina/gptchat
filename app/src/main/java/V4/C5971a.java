package v4;

import B2.E;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import w.C6050B;
import w.C6066m;

/* renamed from: v4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5971a {

    /* renamed from: c  reason: collision with root package name */
    public Map f47150c;

    /* renamed from: d  reason: collision with root package name */
    public Map f47151d;

    /* renamed from: e  reason: collision with root package name */
    public float f47152e;

    /* renamed from: f  reason: collision with root package name */
    public Map f47153f;

    /* renamed from: g  reason: collision with root package name */
    public List f47154g;

    /* renamed from: h  reason: collision with root package name */
    public C6050B f47155h;

    /* renamed from: i  reason: collision with root package name */
    public C6066m f47156i;

    /* renamed from: j  reason: collision with root package name */
    public List f47157j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f47158k;

    /* renamed from: l  reason: collision with root package name */
    public float f47159l;

    /* renamed from: m  reason: collision with root package name */
    public float f47160m;

    /* renamed from: n  reason: collision with root package name */
    public float f47161n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f47162o;

    /* renamed from: a  reason: collision with root package name */
    public final E f47148a = new E();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f47149b = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    public int f47163p = 0;

    public final void a(String str) {
        I4.b.a(str);
        this.f47149b.add(str);
    }

    public final float b() {
        return ((this.f47160m - this.f47159l) / this.f47161n) * 1000.0f;
    }

    public final Map c() {
        float c10 = I4.g.c();
        if (c10 != this.f47152e) {
            for (Map.Entry entry : this.f47151d.entrySet()) {
                Map map = this.f47151d;
                String str = (String) entry.getKey();
                m mVar = (m) entry.getValue();
                float f6 = this.f47152e / c10;
                int i10 = (int) (mVar.f47229a * f6);
                int i11 = (int) (mVar.f47230b * f6);
                m mVar2 = new m(mVar.f47231c, i10, mVar.f47232d, i11, mVar.f47233e);
                Bitmap bitmap = mVar.f47234f;
                if (bitmap != null) {
                    mVar2.f47234f = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                }
                map.put(str, mVar2);
            }
        }
        this.f47152e = c10;
        return this.f47151d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (E4.e eVar : this.f47157j) {
            sb2.append(eVar.a(Separators.HT));
        }
        return sb2.toString();
    }
}

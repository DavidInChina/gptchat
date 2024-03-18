package T0;

import A.C0045u;
import H0.C0714y;
import H0.Q;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5252d;
import r0.C5335B;

/* renamed from: T0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410e {

    /* renamed from: a  reason: collision with root package name */
    public final B0.G f16768a;

    /* renamed from: b  reason: collision with root package name */
    public final p f16769b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16770c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16771d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16772e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16773f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16774g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16775h;

    /* renamed from: i  reason: collision with root package name */
    public z f16776i;

    /* renamed from: j  reason: collision with root package name */
    public N0.C f16777j;

    /* renamed from: k  reason: collision with root package name */
    public s f16778k;

    /* renamed from: m  reason: collision with root package name */
    public C5252d f16780m;

    /* renamed from: n  reason: collision with root package name */
    public C5252d f16781n;

    /* renamed from: l  reason: collision with root package name */
    public wf.k f16779l = C1409d.f16762h0;

    /* renamed from: o  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f16782o = new CursorAnchorInfo.Builder();

    /* renamed from: p  reason: collision with root package name */
    public final float[] f16783p = C5335B.a();

    /* renamed from: q  reason: collision with root package name */
    public final Matrix f16784q = new Matrix();

    public C1410e(B0.G g10, q qVar) {
        this.f16768a = g10;
        this.f16769b = qVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final void a() {
        Y0.h hVar;
        CursorAnchorInfo.Builder builder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        q qVar = (q) this.f16769b;
        if (!((InputMethodManager) qVar.f16809b.getValue()).isActive(qVar.f16808a)) {
            return;
        }
        wf.k kVar = this.f16779l;
        float[] fArr = this.f16783p;
        kVar.invoke(new C5335B(fArr));
        C0714y c0714y = (C0714y) this.f16768a;
        c0714y.v();
        C5335B.e(fArr, c0714y.f7088Q0);
        float d10 = C5251c.d(c0714y.f7092U0);
        float e10 = C5251c.e(c0714y.f7092U0);
        float[] fArr2 = c0714y.f7087P0;
        C5335B.d(fArr2);
        C5335B.f(fArr2, d10, e10);
        Q.v(fArr, fArr2);
        Matrix matrix = this.f16784q;
        androidx.compose.ui.graphics.a.p(matrix, fArr);
        z zVar = this.f16776i;
        AbstractC3557B.Z(zVar);
        s sVar = this.f16778k;
        AbstractC3557B.Z(sVar);
        N0.C c10 = this.f16777j;
        AbstractC3557B.Z(c10);
        C5252d c5252d = this.f16780m;
        AbstractC3557B.Z(c5252d);
        C5252d c5252d2 = this.f16781n;
        AbstractC3557B.Z(c5252d2);
        boolean z11 = this.f16772e;
        boolean z12 = this.f16773f;
        boolean z13 = this.f16774g;
        boolean z14 = this.f16775h;
        CursorAnchorInfo.Builder builder2 = this.f16782o;
        builder2.reset();
        builder2.setMatrix(matrix);
        long j6 = zVar.f16831b;
        int e11 = N0.D.e(j6);
        builder2.setSelectionRange(e11, N0.D.d(j6));
        Y0.h hVar2 = Y0.h.f22028Z;
        if (z11 && e11 >= 0) {
            int b10 = sVar.b(e11);
            C5252d c11 = c10.c(b10);
            float o10 = N.o(c11.f43625a, 0.0f, (int) (c10.f12479c >> 32));
            boolean u02 = A7.b.u0(c5252d, o10, c11.f43626b);
            boolean u03 = A7.b.u0(c5252d, o10, c11.f43628d);
            if (c10.a(b10) == hVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!u02 && !u03) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (!u02 || !u03) {
                i12 |= 2;
            }
            if (z10) {
                i13 = i12 | 4;
            } else {
                i13 = i12;
            }
            float f6 = c11.f43626b;
            float f10 = c11.f43628d;
            hVar = hVar2;
            builder = builder2;
            builder2.setInsertionMarkerLocation(o10, f6, f10, f10, i13);
        } else {
            hVar = hVar2;
            builder = builder2;
        }
        if (z12) {
            int i14 = -1;
            N0.D d11 = zVar.f16832c;
            if (d11 != null) {
                i10 = N0.D.e(d11.f12485a);
            } else {
                i10 = -1;
            }
            if (d11 != null) {
                i14 = N0.D.d(d11.f12485a);
            }
            if (i10 >= 0 && i10 < i14) {
                builder.setComposingText(i10, zVar.f16830a.f12512Y.subSequence(i10, i14));
                int b11 = sVar.b(i10);
                int b12 = sVar.b(i14);
                float[] fArr3 = new float[(b12 - b11) * 4];
                long e12 = U3.f.e(b11, b12);
                N0.i iVar = c10.f12478b;
                iVar.getClass();
                iVar.c(N0.D.e(e12));
                iVar.d(N0.D.d(e12));
                ?? obj = new Object();
                obj.f37647Y = 0;
                Df.H.K(iVar.f12531h, e12, new C0045u(e12, fArr3, (kotlin.jvm.internal.z) obj, (kotlin.jvm.internal.y) new Object()));
                int i15 = i10;
                while (i15 < i14) {
                    int b13 = sVar.b(i15);
                    int i16 = (b13 - b11) * 4;
                    float f11 = fArr3[i16];
                    float f12 = fArr3[i16 + 1];
                    int i17 = i14;
                    float f13 = fArr3[i16 + 2];
                    float f14 = fArr3[i16 + 3];
                    int i18 = b11;
                    if (c5252d.f43627c > f11 && f13 > c5252d.f43625a && c5252d.f43628d > f12 && f14 > c5252d.f43626b) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (!A7.b.u0(c5252d, f11, f12) || !A7.b.u0(c5252d, f13, f14)) {
                        i11 |= 2;
                    }
                    s sVar2 = sVar;
                    Y0.h hVar3 = hVar;
                    if (c10.a(b13) == hVar3) {
                        i11 |= 4;
                    }
                    builder.addCharacterBounds(i15, f11, f12, f13, f14, i11);
                    i15++;
                    fArr3 = fArr3;
                    hVar = hVar3;
                    i14 = i17;
                    b11 = i18;
                    sVar = sVar2;
                }
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 33 && z13) {
            AbstractC1407b.a(builder, c5252d2);
        }
        if (i19 >= 34 && z14) {
            AbstractC1408c.a(builder, c10, c5252d);
        }
        ((InputMethodManager) qVar.f16809b.getValue()).updateCursorAnchorInfo(qVar.f16808a, builder.build());
        this.f16771d = false;
    }
}

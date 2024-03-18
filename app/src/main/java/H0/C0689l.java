package H0;

import N0.C1045d;
import N0.C1046e;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import id.AbstractC3557B;
import java.util.List;
import q0.C5251c;

/* renamed from: H0.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0689l implements AbstractC0696o0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f6969a;

    public C0689l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC3557B.a0("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
        this.f6969a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, H0.s0] */
    public final void a(C1046e c1046e) {
        byte b10;
        List list = c1046e.f12513Z;
        List list2 = kf.v.f37483Y;
        if (list == null) {
            list = list2;
        }
        boolean isEmpty = list.isEmpty();
        String str = c1046e.f12512Y;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            ?? obj = new Object();
            obj.f7033a = Parcel.obtain();
            List list3 = c1046e.f12513Z;
            if (list3 != null) {
                list2 = list3;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1045d c1045d = (C1045d) list2.get(i10);
                N0.y yVar = (N0.y) c1045d.f12508a;
                obj.f7033a.recycle();
                obj.f7033a = Parcel.obtain();
                long b11 = yVar.f12628a.b();
                long j6 = r0.r.f44263k;
                if (!r0.r.c(b11, j6)) {
                    obj.b((byte) 1);
                    obj.f7033a.writeLong(yVar.f12628a.b());
                }
                long j10 = Z0.n.f22810c;
                long j11 = yVar.f12629b;
                byte b12 = 2;
                if (!Z0.n.a(j11, j10)) {
                    obj.b((byte) 2);
                    obj.d(j11);
                }
                S0.D d10 = yVar.f12630c;
                if (d10 != null) {
                    obj.b((byte) 3);
                    obj.f7033a.writeInt(d10.f15975Y);
                }
                S0.z zVar = yVar.f12631d;
                if (zVar != null) {
                    obj.b((byte) 4);
                    int i11 = zVar.f16061a;
                    if (S0.z.a(i11, 0) || !S0.z.a(i11, 1)) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                    obj.b(b10);
                }
                S0.A a5 = yVar.f12632e;
                if (a5 != null) {
                    obj.b((byte) 5);
                    int i12 = a5.f15966a;
                    if (!S0.A.a(i12, 0)) {
                        if (S0.A.a(i12, 1)) {
                            b12 = 1;
                        } else if (!S0.A.a(i12, 2)) {
                            if (S0.A.a(i12, 3)) {
                                b12 = 3;
                            }
                        }
                        obj.b(b12);
                    }
                    b12 = 0;
                    obj.b(b12);
                }
                String str2 = yVar.f12634g;
                if (str2 != null) {
                    obj.b((byte) 6);
                    obj.f7033a.writeString(str2);
                }
                long j12 = yVar.f12635h;
                if (!Z0.n.a(j12, j10)) {
                    obj.b((byte) 7);
                    obj.d(j12);
                }
                Y0.a aVar = yVar.f12636i;
                if (aVar != null) {
                    obj.b((byte) 8);
                    obj.c(aVar.f22014a);
                }
                Y0.p pVar = yVar.f12637j;
                if (pVar != null) {
                    obj.b((byte) 9);
                    obj.c(pVar.f22040a);
                    obj.c(pVar.f22041b);
                }
                long j13 = yVar.f12639l;
                if (!r0.r.c(j13, j6)) {
                    obj.b((byte) 10);
                    obj.f7033a.writeLong(j13);
                }
                Y0.j jVar = yVar.f12640m;
                if (jVar != null) {
                    obj.b((byte) 11);
                    obj.f7033a.writeInt(jVar.f22034a);
                }
                r0.K k10 = yVar.f12641n;
                if (k10 != null) {
                    obj.b((byte) 12);
                    obj.f7033a.writeLong(k10.f44203a);
                    long j14 = k10.f44204b;
                    obj.c(C5251c.d(j14));
                    obj.c(C5251c.e(j14));
                    obj.c(k10.f44205c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.f7033a.marshall(), 0)), c1045d.f12509b, c1045d.f12510c, 33);
            }
            str = spannableString;
        }
        this.f6969a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}

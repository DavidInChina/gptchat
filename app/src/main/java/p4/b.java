package p4;

import Lg.n;
import Wh.D;
import Wh.q;
import android.graphics.Bitmap;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import jh.H1;
import ji.C4115D;
import ji.C4116E;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3957g f42714a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3957g f42715b;

    /* renamed from: c  reason: collision with root package name */
    public final long f42716c;

    /* renamed from: d  reason: collision with root package name */
    public final long f42717d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f42718e;

    /* renamed from: f  reason: collision with root package name */
    public final q f42719f;

    public b(C4116E c4116e) {
        EnumC3958h enumC3958h = EnumC3958h.f36153Z;
        this.f42714a = R4.b.C1(enumC3958h, new C5088a(this, 0));
        boolean z10 = true;
        this.f42715b = R4.b.C1(enumC3958h, new C5088a(this, 1));
        this.f42716c = Long.parseLong(c4116e.R(Long.MAX_VALUE));
        this.f42717d = Long.parseLong(c4116e.R(Long.MAX_VALUE));
        this.f42718e = Integer.parseInt(c4116e.R(Long.MAX_VALUE)) <= 0 ? false : z10;
        int parseInt = Integer.parseInt(c4116e.R(Long.MAX_VALUE));
        ArrayList arrayList = new ArrayList(20);
        for (int i10 = 0; i10 < parseInt; i10++) {
            String R10 = c4116e.R(Long.MAX_VALUE);
            Bitmap.Config[] configArr = u4.e.f46388a;
            int k22 = n.k2(R10, ':', 0, false, 6);
            if (k22 != -1) {
                String substring = R10.substring(0, k22);
                AbstractC3557B.b0("substring(...)", substring);
                String obj = n.U2(substring).toString();
                String substring2 = R10.substring(k22 + 1);
                AbstractC3557B.b0("substring(...)", substring2);
                AbstractC3557B.c0("name", obj);
                H1.i(obj);
                arrayList.add(obj);
                arrayList.add(n.U2(substring2).toString());
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(R10).toString());
            }
        }
        this.f42719f = new q((String[]) arrayList.toArray(new String[0]));
    }

    public final void a(C4115D c4115d) {
        long j6;
        c4115d.M0(this.f42716c);
        c4115d.I(10);
        c4115d.M0(this.f42717d);
        c4115d.I(10);
        if (this.f42718e) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        c4115d.M0(j6);
        c4115d.I(10);
        q qVar = this.f42719f;
        c4115d.M0(qVar.size());
        c4115d.I(10);
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            c4115d.c0(qVar.y(i10));
            c4115d.c0(": ");
            c4115d.c0(qVar.T(i10));
            c4115d.I(10);
        }
    }

    public b(D d10) {
        EnumC3958h enumC3958h = EnumC3958h.f36153Z;
        boolean z10 = false;
        this.f42714a = R4.b.C1(enumC3958h, new C5088a(this, 0));
        this.f42715b = R4.b.C1(enumC3958h, new C5088a(this, 1));
        this.f42716c = d10.f21140p0;
        this.f42717d = d10.f21141q0;
        this.f42718e = d10.f21134j0 != null ? true : z10;
        this.f42719f = d10.f21135k0;
    }
}

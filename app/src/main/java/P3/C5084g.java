package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2.C5065s;
import x8.N;

/* renamed from: p3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5084g {

    /* renamed from: a  reason: collision with root package name */
    public final int f42501a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final List f42502b;

    public C5084g(N n10) {
        this.f42502b = n10;
    }

    public final List a(s2.s sVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        boolean b10 = b(32);
        List list2 = this.f42502b;
        if (b10) {
            return list2;
        }
        s2.u uVar = new s2.u((byte[]) sVar.f45184d);
        while (uVar.a() > 0) {
            int u10 = uVar.u();
            int u11 = uVar.f45194b + uVar.u();
            if (u10 == 134) {
                ArrayList arrayList = new ArrayList();
                int u12 = uVar.u() & 31;
                for (int i11 = 0; i11 < u12; i11++) {
                    String s10 = uVar.s(3, w8.e.f48221c);
                    int u13 = uVar.u();
                    if ((u13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = u13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte u14 = (byte) uVar.u();
                    uVar.G(1);
                    if (z10) {
                        list = Collections.singletonList((u14 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    p2.r rVar = new p2.r();
                    rVar.f42237k = str;
                    rVar.f42229c = s10;
                    rVar.f42222C = i10;
                    rVar.f42239m = list;
                    arrayList.add(new C5065s(rVar));
                }
                list2 = arrayList;
            }
            uVar.F(u11);
        }
        return list2;
    }

    public final boolean b(int i10) {
        if ((i10 & this.f42501a) != 0) {
            return true;
        }
        return false;
    }
}

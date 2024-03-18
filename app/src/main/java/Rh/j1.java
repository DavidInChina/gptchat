package Rh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z.AbstractC6708l;
import zh.AbstractC6877e;
import zh.AbstractC6878f;

/* loaded from: classes.dex */
public final class j1 extends AbstractC1293c {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f15917k0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC6878f f15918j0;

    public j1(y7.b bVar, AbstractC6878f abstractC6878f) {
        super(bVar, k1.f15921Y);
        this.f15918j0 = abstractC6878f;
    }

    @Override // Rh.AbstractC1293c
    public final o1 b(String str) {
        try {
            AbstractC6877e G10 = this.f15918j0.G(str);
            if (G10.b()) {
                return new n1(e(G10.a()));
            }
            return new m1(str);
        } catch (IOException e10) {
            throw new IllegalStateException("Error while reading class file", e10);
        }
    }

    public final d1 e(byte[] bArr) {
        Nh.b a5 = Sh.I.a(bArr);
        i1 i1Var = new i1(this);
        a5.a(i1Var, new io.sentry.android.core.z[0], 1);
        if (i1Var.f15898m != null && i1Var.f15909x != null) {
            HashMap hashMap = i1Var.f15889d;
            Map map = (Map) hashMap.remove(-1);
            int i10 = i1Var.f15896k;
            int i11 = i1Var.f15897l;
            String str = i1Var.f15898m;
            String str2 = i1Var.f15899n;
            String[] strArr = i1Var.f15901p;
            String str3 = i1Var.f15900o;
            c1 c1Var = i1Var.f15905t;
            String str4 = i1Var.f15906u;
            ArrayList arrayList = i1Var.f15907v;
            boolean z10 = i1Var.f15902q;
            String str5 = i1Var.f15903r;
            ArrayList arrayList2 = i1Var.f15904s;
            if (map == null) {
                map = Collections.emptyMap();
            }
            return new d1(this, i10, i11, str, str2, strArr, str3, c1Var, str4, arrayList, z10, str5, arrayList2, map, hashMap, i1Var.f15890e, i1Var.f15891f, i1Var.f15892g, i1Var.f15893h, i1Var.f15894i, i1Var.f15895j, i1Var.f15908w, i1Var.f15909x);
        }
        throw new IllegalStateException("Internal name or class file version were not set");
    }

    @Override // Rh.AbstractC1293c
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (!AbstractC6708l.c(2, 2) || !this.f15918j0.equals(j1Var.f15918j0)) {
            return false;
        }
        return true;
    }

    @Override // Rh.AbstractC1293c
    public final int hashCode() {
        int hashCode = this.f15918j0.hashCode();
        return AbstractC6708l.f(2) + ((hashCode + (super.hashCode() * 31)) * 31);
    }
}

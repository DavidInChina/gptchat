package H;

import B.W0;
import E0.d0;
import java.util.List;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import l0.C4317i;

/* renamed from: H.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0659h implements AbstractC0660i {

    /* renamed from: a  reason: collision with root package name */
    public final int f6623a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6624b;

    /* renamed from: c  reason: collision with root package name */
    public final List f6625c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6626d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f6627e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4311c f6628f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC4312d f6629g;

    /* renamed from: h  reason: collision with root package name */
    public final Z0.l f6630h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6631i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6632j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6633k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f6634l;

    /* renamed from: m  reason: collision with root package name */
    public int f6635m;

    /* renamed from: n  reason: collision with root package name */
    public int f6636n;

    public C0659h(int i10, int i11, List list, long j6, Object obj, W0 w02, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d, Z0.l lVar, boolean z10) {
        boolean z11;
        int i12;
        this.f6623a = i10;
        this.f6624b = i11;
        this.f6625c = list;
        this.f6626d = j6;
        this.f6627e = obj;
        this.f6628f = abstractC4311c;
        this.f6629g = abstractC4312d;
        this.f6630h = lVar;
        this.f6631i = z10;
        if (w02 == W0.f1213Y) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6632j = z11;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            d0 d0Var = (d0) list.get(i14);
            if (!this.f6632j) {
                i12 = d0Var.f4054Z;
            } else {
                i12 = d0Var.f4053Y;
            }
            i13 = Math.max(i13, i12);
        }
        this.f6633k = i13;
        this.f6634l = new int[this.f6625c.size() * 2];
        this.f6636n = Integer.MIN_VALUE;
    }

    public final void a(int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f6635m = i10;
        boolean z10 = this.f6632j;
        if (z10) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f6636n = i13;
        List list = this.f6625c;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            d0 d0Var = (d0) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f6634l;
            if (z10) {
                AbstractC4311c abstractC4311c = this.f6628f;
                if (abstractC4311c != null) {
                    iArr[i16] = abstractC4311c.a(d0Var.f4053Y, i11, this.f6630h);
                    iArr[i16 + 1] = i10;
                    i14 = d0Var.f4054Z;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
            } else {
                iArr[i16] = i10;
                int i17 = i16 + 1;
                AbstractC4312d abstractC4312d = this.f6629g;
                if (abstractC4312d != null) {
                    iArr[i17] = ((C4317i) abstractC4312d).a(d0Var.f4054Z, i12);
                    i14 = d0Var.f4053Y;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
            }
            i10 += i14;
        }
    }
}

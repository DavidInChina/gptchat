package db;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.k;
import wf.n;
import x8.W;

/* renamed from: db.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2616d extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28181Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f28182Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f28183h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f28184i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f28185j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f28186k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2616d(String str, k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f28181Y = i12;
        this.f28182Z = str;
        this.f28183h0 = kVar;
        this.f28184i0 = abstractC4326r;
        this.f28185j0 = i10;
        this.f28186k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28181Y;
        int i12 = this.f28185j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                W.n(this.f28182Z, this.f28183h0, this.f28184i0, abstractC1725n, p10, this.f28186k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                K8.d.T(this.f28182Z, this.f28183h0, this.f28184i0, abstractC1725n, p11, this.f28186k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28181Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

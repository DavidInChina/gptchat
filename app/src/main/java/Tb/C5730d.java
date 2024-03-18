package tb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

/* renamed from: tb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5730d extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46040Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f46041Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f46042h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f46043i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ k f46044j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ i f46045k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f46046l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f46047m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5730d(String str, String str2, String str3, k kVar, i iVar, int i10, int i11, int i12) {
        super(2);
        this.f46040Y = i12;
        this.f46041Z = str;
        this.f46042h0 = str2;
        this.f46043i0 = str3;
        this.f46044j0 = kVar;
        this.f46045k0 = iVar;
        this.f46046l0 = i10;
        this.f46047m0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46040Y;
        int i12 = this.f46046l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                Bi.c.q(this.f46041Z, this.f46042h0, this.f46043i0, this.f46044j0, this.f46045k0, abstractC1725n, p10, this.f46047m0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                Bi.c.q(this.f46041Z, this.f46042h0, this.f46043i0, this.f46044j0, this.f46045k0, abstractC1725n, p11, this.f46047m0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f46040Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

package v9;

import N0.E;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;
import x8.W;

/* loaded from: classes2.dex */
public final class e extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f47411Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f47412Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f47413h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f47414i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ E f47415j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f47416k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f47417l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, AbstractC4326r abstractC4326r, long j6, long j10, E e10, int i10, int i11) {
        super(2);
        this.f47411Y = str;
        this.f47412Z = abstractC4326r;
        this.f47413h0 = j6;
        this.f47414i0 = j10;
        this.f47415j0 = e10;
        this.f47416k0 = i10;
        this.f47417l0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f47416k0 | 1);
        long j6 = this.f47414i0;
        E e10 = this.f47415j0;
        W.k(this.f47411Y, this.f47412Z, this.f47413h0, j6, e10, (AbstractC1725n) obj, p10, this.f47417l0);
        return y.f36177a;
    }
}

package db;

import E.AbstractC0441z;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.k;
import wf.n;
import x8.W;

/* renamed from: db.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2619g extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC0441z f28193Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f28194Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f28195h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f28196i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f28197j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f28198k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f28199l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2619g(AbstractC0441z abstractC0441z, int i10, k kVar, AbstractC4326r abstractC4326r, int i11, int i12, int i13) {
        super(2);
        this.f28193Y = abstractC0441z;
        this.f28194Z = i10;
        this.f28195h0 = kVar;
        this.f28196i0 = abstractC4326r;
        this.f28197j0 = i11;
        this.f28198k0 = i12;
        this.f28199l0 = i13;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f28198k0 | 1);
        AbstractC4326r abstractC4326r = this.f28196i0;
        int i10 = this.f28197j0;
        W.t(this.f28193Y, this.f28194Z, this.f28195h0, abstractC4326r, i10, (AbstractC1725n) obj, p10, this.f28199l0);
        return y.f36177a;
    }
}

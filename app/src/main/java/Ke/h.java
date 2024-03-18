package ke;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import te.C5761e;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f37384Y;

    /* renamed from: Z  reason: collision with root package name */
    public C5761e f37385Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f37386h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k f37387i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37388j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37387i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37386h0 = obj;
        this.f37388j0 |= Integer.MIN_VALUE;
        return this.f37387i0.j(null, this);
    }
}

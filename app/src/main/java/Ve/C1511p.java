package Ve;

import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511p extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f18838Y;

    /* renamed from: Z  reason: collision with root package name */
    public SessionDescription f18839Z;

    /* renamed from: h0  reason: collision with root package name */
    public SessionDescription f18840h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f18841i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f18842j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18843k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f18844l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511p(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18843k0 = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18842j0 = obj;
        this.f18844l0 |= Integer.MIN_VALUE;
        return this.f18843k0.e(null, null, false, this);
    }
}

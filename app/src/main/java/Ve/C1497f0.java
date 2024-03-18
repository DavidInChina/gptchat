package Ve;

import livekit.LivekitModels$DataPacket;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1497f0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1503i0 f18754Y;

    /* renamed from: Z  reason: collision with root package name */
    public LivekitModels$DataPacket f18755Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18756h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18757i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f18758j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1497f0(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18757i0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18756h0 = obj;
        this.f18758j0 |= Integer.MIN_VALUE;
        return this.f18757i0.l(null, this);
    }
}

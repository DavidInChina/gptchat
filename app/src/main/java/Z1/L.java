package Z1;

import android.os.Bundle;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class L extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22872Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f22873Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f22874h0;

    /* renamed from: i0  reason: collision with root package name */
    public Bundle f22875i0;

    /* renamed from: j0  reason: collision with root package name */
    public C1754c f22876j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f22877k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ N f22878l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f22879m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22878l0 = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22877k0 = obj;
        this.f22879m0 |= Integer.MIN_VALUE;
        return this.f22878l0.d(null, 0, null, null, this);
    }
}

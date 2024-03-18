package Z1;

import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22859Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f22860Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22861h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f22862i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N f22863j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f22864k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22863j0 = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22862i0 = obj;
        this.f22864k0 |= Integer.MIN_VALUE;
        return this.f22863j0.a(null, 0, this);
    }
}

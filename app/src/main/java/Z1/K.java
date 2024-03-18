package Z1;

import android.content.Context;
import android.os.Bundle;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class K extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public N f22865Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f22866Z;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f22867h0;

    /* renamed from: i0  reason: collision with root package name */
    public C1754c f22868i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f22869j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ N f22870k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f22871l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22870k0 = n10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22869j0 = obj;
        this.f22871l0 |= Integer.MIN_VALUE;
        return this.f22870k0.c(null, 0, null, this);
    }
}

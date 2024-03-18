package g2;

import Pg.C1171d;
import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: g2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3154l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC3155m f31110Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f31111Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.k f31112h0;

    /* renamed from: i0  reason: collision with root package name */
    public C1171d f31113i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f31114j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3155m f31115k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f31116l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3154l(AbstractC3155m abstractC3155m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31115k0 = abstractC3155m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31114j0 = obj;
        this.f31116l0 |= Integer.MIN_VALUE;
        return this.f31115k0.c(null, null, this);
    }
}

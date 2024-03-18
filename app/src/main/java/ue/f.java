package ue;

import io.ktor.utils.io.z;
import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f46727Y;

    /* renamed from: Z  reason: collision with root package name */
    public z f46728Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f46729h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f46730i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f46731j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ g f46732k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f46733l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f46732k0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f46731j0 = obj;
        this.f46733l0 |= Integer.MIN_VALUE;
        return this.f46732k0.e(null, this);
    }
}

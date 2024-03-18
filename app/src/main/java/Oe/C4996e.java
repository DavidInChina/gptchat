package oe;

import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import te.C5760d;
import xe.C6417f;

/* renamed from: oe.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4996e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5760d f41306Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f41307Z;

    /* renamed from: h0  reason: collision with root package name */
    public C6417f f41308h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f41309i0;

    /* renamed from: j0  reason: collision with root package name */
    public Iterator f41310j0;

    /* renamed from: k0  reason: collision with root package name */
    public C4993b f41311k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f41312l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C4999h f41313m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f41314n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4996e(C4999h c4999h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41313m0 = c4999h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41312l0 = obj;
        this.f41314n0 |= Integer.MIN_VALUE;
        return this.f41313m0.a(null, null, this);
    }
}

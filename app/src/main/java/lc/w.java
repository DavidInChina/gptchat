package Lc;

import java.util.Map;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class w extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f11026Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f11027Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f11028h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f11029i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f11030j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f11031k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ y f11032l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f11033m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11032l0 = yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11031k0 = obj;
        this.f11033m0 |= Integer.MIN_VALUE;
        return this.f11032l0.a(null, this, false);
    }
}

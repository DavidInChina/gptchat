package rh;

import Nh.l;
import Qh.AbstractC1230h;
import Sh.I;
import java.util.HashMap;
import java.util.Map;
import wh.AbstractC6250o;

/* renamed from: rh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5497d extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC1230h f44989d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1230h f44990e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f44991f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f44992g;

    public C5497d(io.sentry.vendor.b bVar, AbstractC1230h abstractC1230h, AbstractC1230h abstractC1230h2, HashMap hashMap, HashMap hashMap2) {
        super(I.f16703b, bVar, 0);
        this.f44989d = abstractC1230h;
        this.f44990e = abstractC1230h2;
        this.f44991f = hashMap;
        this.f44992g = hashMap2;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b j(int i10, Object obj, String str, String str2, String str3) {
        vh.c cVar = (vh.c) this.f44991f.get(str + str2);
        if (cVar != null && this.f44989d.a(cVar)) {
            return null;
        }
        return super.j(i10, obj, str, str2, str3);
    }

    @Override // io.sentry.vendor.b
    public final l m(int i10, String str, String str2, String str3, String[] strArr) {
        AbstractC6250o abstractC6250o = (AbstractC6250o) this.f44992g.get(str + str2);
        if (abstractC6250o != null && this.f44990e.a(abstractC6250o)) {
            return null;
        }
        return super.m(i10, str, str2, str3, strArr);
    }
}

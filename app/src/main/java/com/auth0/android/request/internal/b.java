package com.auth0.android.request.internal;

import I8.E;
import U3.u;
import h5.C3323a;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import l5.C4336a;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26719a;

    /* renamed from: b  reason: collision with root package name */
    public final l5.f f26720b;

    /* renamed from: c  reason: collision with root package name */
    public final l5.e f26721c;

    /* renamed from: d  reason: collision with root package name */
    public final C3323a f26722d;

    /* renamed from: e  reason: collision with root package name */
    public final m f26723e;

    /* renamed from: f  reason: collision with root package name */
    public final u f26724f;

    public b(l5.d dVar, String str, l5.f fVar, e eVar, C3323a c3323a, c cVar) {
        AbstractC3557B.c0("url", str);
        AbstractC3557B.c0("errorAdapter", c3323a);
        this.f26719a = str;
        this.f26720b = fVar;
        this.f26721c = eVar;
        this.f26722d = c3323a;
        this.f26723e = cVar;
        this.f26724f = new u(dVar);
    }

    public final void a(Map map) {
        LinkedHashMap m12 = AbstractC4268D.m1(map);
        if (map.containsKey("scope")) {
            m12.put("scope", AbstractC4828h.S((String) AbstractC4268D.Z0("scope", map)));
        }
        ((Map) this.f26724f.f17493h0).putAll(m12);
    }

    public final Object b() {
        C3323a c3323a = this.f26722d;
        try {
            l5.g a5 = ((C4336a) this.f26720b).a(this.f26719a, this.f26724f);
            InputStreamReader inputStreamReader = new InputStreamReader(a5.f37839b, StandardCharsets.UTF_8);
            int i10 = a5.f37838a;
            try {
                try {
                    if (200 <= i10 && i10 < 300) {
                        try {
                            E e10 = ((e) this.f26721c).f26730a;
                            e10.getClass();
                            Object b10 = e10.b(new P8.b(inputStreamReader));
                            th = null;
                            return b10;
                        } catch (Exception e11) {
                            c3323a.getClass();
                            throw C3323a.a(e11);
                        }
                    }
                    try {
                        if (!a5.a()) {
                            String x02 = P4.a.x0(inputStreamReader);
                            Map map = a5.f37840c;
                            c3323a.getClass();
                            throw C3323a.c(i10, x02, map);
                        }
                        throw c3323a.b(i10, inputStreamReader);
                    } catch (Exception e12) {
                        c3323a.getClass();
                        throw C3323a.a(e12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th2;
            } finally {
                Ad.l.S(inputStreamReader, th2);
            }
        } catch (IOException e13) {
            c3323a.getClass();
            throw C3323a.a(e13);
        }
    }
}

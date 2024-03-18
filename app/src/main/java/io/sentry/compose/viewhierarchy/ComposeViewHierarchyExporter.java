package io.sentry.compose.viewhierarchy;

import E0.V;
import L0.k;
import L0.u;
import androidx.compose.ui.node.a;
import b0.C2104h;
import io.sentry.C3636c1;
import io.sentry.H;
import io.sentry.protocol.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l0.AbstractC4326r;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class ComposeViewHierarchyExporter {

    /* renamed from: a  reason: collision with root package name */
    public final H f34312a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C3636c1 f34313b;

    public ComposeViewHierarchyExporter(H h10) {
        this.f34312a = h10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.sentry.protocol.E, java.lang.Object] */
    public static void a(a aVar, a aVar2, C3636c1 c3636c1, E e10) {
        C5252d m10;
        if (aVar2.T()) {
            ?? obj = new Object();
            for (V v10 : aVar2.D()) {
                AbstractC4326r abstractC4326r = v10.f4041a;
                if (abstractC4326r instanceof k) {
                    Iterator it = ((k) abstractC4326r).k().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = ((u) entry.getKey()).f10473a;
                        if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                            if (entry.getValue() instanceof String) {
                                obj.f34485i0 = (String) entry.getValue();
                            }
                        }
                    }
                }
            }
            int s10 = aVar2.s();
            int G10 = aVar2.G();
            obj.f34487k0 = Double.valueOf(s10);
            obj.f34486j0 = Double.valueOf(G10);
            C5252d m11 = c3636c1.m(aVar2);
            if (m11 != null) {
                double d10 = m11.f43625a;
                double d11 = m11.f43626b;
                if (aVar != null && (m10 = c3636c1.m(aVar)) != null) {
                    d10 -= m10.f43625a;
                    d11 -= m10.f43626b;
                }
                obj.f34488l0 = Double.valueOf(d10);
                obj.f34489m0 = Double.valueOf(d11);
            }
            String str2 = obj.f34485i0;
            if (str2 != null) {
                obj.f34483Z = str2;
            } else {
                obj.f34483Z = "@Composable";
            }
            if (e10.f34492p0 == null) {
                e10.f34492p0 = new ArrayList();
            }
            e10.f34492p0.add(obj);
            C2104h I10 = aVar2.I();
            int i10 = I10.f25569h0;
            for (int i11 = 0; i11 < i10; i11++) {
                a(aVar2, (a) I10.f25567Y[i11], c3636c1, obj);
            }
        }
    }
}

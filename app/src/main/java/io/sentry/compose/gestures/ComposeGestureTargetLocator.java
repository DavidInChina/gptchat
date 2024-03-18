package io.sentry.compose.gestures;

import E0.V;
import H0.C0714y;
import L0.k;
import L0.u;
import android.view.View;
import androidx.compose.ui.node.Owner;
import io.sentry.C3636c1;
import io.sentry.H;
import io.sentry.internal.gestures.a;
import io.sentry.internal.gestures.b;
import io.sentry.internal.gestures.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import l0.AbstractC4326r;
import q0.C5252d;

/* loaded from: classes.dex */
public final class ComposeGestureTargetLocator implements a {

    /* renamed from: a  reason: collision with root package name */
    public final H f34310a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C3636c1 f34311b;

    public ComposeGestureTargetLocator(H h10) {
        this.f34310a = h10;
        C3636c1.l().a("ComposeUserInteraction");
        C3636c1.l().c("maven:io.sentry:sentry-compose");
    }

    @Override // io.sentry.internal.gestures.a
    public final c a(View view, float f6, float f10, b bVar) {
        String str;
        C5252d m10;
        if (this.f34311b == null) {
            synchronized (this) {
                try {
                    if (this.f34311b == null) {
                        this.f34311b = new C3636c1(this.f34310a);
                    }
                } finally {
                }
            }
        }
        if (!(view instanceof Owner)) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(((C0714y) ((Owner) view)).getRoot());
        String str2 = null;
        String str3 = null;
        while (true) {
            if (!linkedList.isEmpty()) {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) linkedList.poll();
                if (aVar != null) {
                    if (aVar.T() && (m10 = this.f34311b.m(aVar)) != null && f6 >= m10.f43625a && f6 <= m10.f43627c && f10 >= m10.f43626b && f10 <= m10.f43628d) {
                        boolean z10 = false;
                        boolean z11 = false;
                        for (V v10 : aVar.D()) {
                            AbstractC4326r abstractC4326r = v10.f4041a;
                            if (abstractC4326r instanceof k) {
                                Iterator it = ((k) abstractC4326r).k().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    String str4 = ((u) entry.getKey()).f10473a;
                                    if ("ScrollBy".equals(str4)) {
                                        z11 = true;
                                    } else if ("OnClick".equals(str4)) {
                                        z10 = true;
                                    } else if ("SentryTag".equals(str4) || "TestTag".equals(str4)) {
                                        if (entry.getValue() instanceof String) {
                                            str3 = (String) entry.getValue();
                                        }
                                    }
                                }
                            } else {
                                String canonicalName = abstractC4326r.getClass().getCanonicalName();
                                if (!"androidx.compose.foundation.ClickableElement".equals(canonicalName) && !"androidx.compose.foundation.CombinedClickableElement".equals(canonicalName)) {
                                    if ("androidx.compose.foundation.ScrollingLayoutElement".equals(canonicalName)) {
                                        z11 = true;
                                    }
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10 && bVar == b.CLICKABLE) {
                            str2 = str3;
                        }
                        if (z11 && bVar == b.SCROLLABLE) {
                            str = str3;
                            break;
                        }
                    }
                    linkedList.addAll(aVar.I().e());
                }
            } else {
                str = str2;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        return new c(null, null, null, str, "jetpack_compose");
    }
}

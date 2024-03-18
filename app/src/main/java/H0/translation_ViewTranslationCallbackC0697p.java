package H0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: H0.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class translation.ViewTranslationCallbackC0697p implements ViewTranslationCallback {
    public final boolean onClearTranslation(View view) {
        AbstractC6216a abstractC6216a;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        O o10 = ((C0714y) view).f7127t0;
        o10.f6817U0 = 1;
        for (S0 s02 : o10.t().values()) {
            L0.j jVar = s02.f6878a.f10421d;
            if (U3.f.T(jVar, L0.r.f10468x) != null) {
                Object obj = jVar.f10409Y.get(L0.i.f10394k);
                if (obj == null) {
                    obj = null;
                }
                L0.a aVar = (L0.a) obj;
                if (aVar != null && (abstractC6216a = (AbstractC6216a) aVar.f10369b) != null) {
                    Boolean bool = (Boolean) abstractC6216a.mo122invoke();
                }
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        wf.k kVar;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        O o10 = ((C0714y) view).f7127t0;
        o10.f6817U0 = 1;
        for (S0 s02 : o10.t().values()) {
            L0.j jVar = s02.f6878a.f10421d;
            if (AbstractC3557B.K(U3.f.T(jVar, L0.r.f10468x), Boolean.TRUE)) {
                Object obj = jVar.f10409Y.get(L0.i.f10393j);
                if (obj == null) {
                    obj = null;
                }
                L0.a aVar = (L0.a) obj;
                if (aVar != null && (kVar = (wf.k) aVar.f10369b) != null) {
                    Boolean bool = (Boolean) kVar.invoke(Boolean.FALSE);
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        wf.k kVar;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        O o10 = ((C0714y) view).f7127t0;
        o10.f6817U0 = 2;
        for (S0 s02 : o10.t().values()) {
            L0.j jVar = s02.f6878a.f10421d;
            if (AbstractC3557B.K(U3.f.T(jVar, L0.r.f10468x), Boolean.FALSE)) {
                Object obj = jVar.f10409Y.get(L0.i.f10393j);
                if (obj == null) {
                    obj = null;
                }
                L0.a aVar = (L0.a) obj;
                if (aVar != null && (kVar = (wf.k) aVar.f10369b) != null) {
                    Boolean bool = (Boolean) kVar.invoke(Boolean.TRUE);
                }
            }
        }
        return true;
    }
}

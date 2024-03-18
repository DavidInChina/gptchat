package H0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import id.AbstractC3557B;

/* renamed from: H0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0687k implements AbstractC0683i {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityManager f6967a;

    public C0687k(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC3557B.a0("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        this.f6967a = (AccessibilityManager) systemService;
    }
}

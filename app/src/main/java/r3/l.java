package r3;

import android.view.Choreographer;
import android.view.View;
import id.AbstractC3557B;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, View view) {
        super(iVar, view);
        AbstractC3557B.c0("jankStats", iVar);
    }

    @Override // r3.k
    public final AbstractViewTreeObserver$OnPreDrawListenerC5361d P2(View view, Choreographer choreographer, ArrayList arrayList) {
        AbstractC3557B.c0("choreographer", choreographer);
        return new AbstractViewTreeObserver$OnPreDrawListenerC5361d(view, choreographer, arrayList);
    }
}

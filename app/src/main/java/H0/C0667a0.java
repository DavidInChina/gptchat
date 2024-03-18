package H0;

import android.view.ActionMode;
import android.view.View;
import q0.C5252d;
import wf.AbstractC6216a;
import z.C6672L;

/* renamed from: H0.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667a0 implements U0 {

    /* renamed from: a  reason: collision with root package name */
    public final View f6902a;

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f6903b;

    /* renamed from: c  reason: collision with root package name */
    public final I0.b f6904c = new I0.b(new C6672L(25, this));

    /* renamed from: d  reason: collision with root package name */
    public int f6905d = 2;

    public C0667a0(View view) {
        this.f6902a = view;
    }

    public final void a(C5252d c5252d, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC6216a abstractC6216a4) {
        I0.b bVar = this.f6904c;
        bVar.f7944b = c5252d;
        bVar.f7945c = abstractC6216a;
        bVar.f7947e = abstractC6216a3;
        bVar.f7946d = abstractC6216a2;
        bVar.f7948f = abstractC6216a4;
        ActionMode actionMode = this.f6903b;
        if (actionMode == null) {
            this.f6905d = 1;
            this.f6903b = V0.f6882a.b(this.f6902a, new I0.a(bVar), 1);
            return;
        }
        actionMode.invalidate();
    }
}

package p;

import androidx.appcompat.view.menu.ActionMenuItemView;
import q.C5212h;
import q.C5214i;
import q.D0;

/* renamed from: p.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5026b extends D0 {

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f41548o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5026b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f41548o0 = actionMenuItemView;
    }

    @Override // q.D0
    public final G b() {
        C5212h c5212h;
        AbstractC5027c abstractC5027c = this.f41548o0.f24423t0;
        if (abstractC5027c == null || (c5212h = ((C5214i) abstractC5027c).f43434a.f43472y0) == null) {
            return null;
        }
        return c5212h.a();
    }

    @Override // q.D0
    public final boolean c() {
        G b10;
        ActionMenuItemView actionMenuItemView = this.f41548o0;
        n nVar = actionMenuItemView.f24421r0;
        if (nVar == null || !nVar.a(actionMenuItemView.f24418o0) || (b10 = b()) == null || !b10.a()) {
            return false;
        }
        return true;
    }
}

package H0;

import H0.View$OnDragListenerC0711w0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import l0.AbstractC4325q;
import n0.AbstractC4704c;
import n0.AbstractC4705d;
import n0.C4703b;
import n0.C4708g;
import w.C6060g;

/* renamed from: H0.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnDragListenerC0711w0 implements View.OnDragListener, AbstractC4704c {

    /* renamed from: a  reason: collision with root package name */
    public final C4708g f7059a = new AbstractC4325q();

    /* renamed from: b  reason: collision with root package name */
    public final C6060g f7060b = new C6060g(0);

    /* renamed from: c  reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f7061c = new G0.X() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // G0.X
        public final int hashCode() {
            return View$OnDragListenerC0711w0.this.f7059a.hashCode();
        }

        @Override // G0.X
        public final AbstractC4325q j() {
            return View$OnDragListenerC0711w0.this.f7059a;
        }

        @Override // G0.X
        public final /* bridge */ /* synthetic */ void m(AbstractC4325q abstractC4325q) {
            C4708g c4708g = (C4708g) abstractC4325q;
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C4703b c4703b = new C4703b(dragEvent);
        int action = dragEvent.getAction();
        C4708g c4708g = this.f7059a;
        switch (action) {
            case 1:
                boolean A02 = c4708g.A0(c4703b);
                for (AbstractC4705d abstractC4705d : this.f7060b) {
                    ((C4708g) abstractC4705d).G0(c4703b);
                }
                return A02;
            case 2:
                c4708g.F0(c4703b);
                return false;
            case 3:
                return c4708g.B0(c4703b);
            case 4:
                c4708g.C0(c4703b);
                return false;
            case 5:
                c4708g.D0(c4703b);
                return false;
            case 6:
                c4708g.E0(c4703b);
                return false;
            default:
                return false;
        }
    }
}

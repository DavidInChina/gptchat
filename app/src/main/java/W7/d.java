package W7;

import E1.h;
import E1.p;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends L1.b {

    /* renamed from: v0  reason: collision with root package name */
    public final /* synthetic */ Chip f20757v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f20757v0 = chip;
    }

    @Override // L1.b
    public final void m(ArrayList arrayList) {
        boolean z10 = false;
        arrayList.add(0);
        Rect rect = Chip.f27100D0;
        Chip chip = this.f20757v0;
        if (chip.c()) {
            f fVar = chip.f27106l0;
            if (fVar != null && fVar.f20784P0) {
                z10 = true;
            }
            if (z10 && chip.f27109o0 != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // L1.b
    public final void p(int i10, p pVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        CharSequence charSequence = "";
        if (i10 == 1) {
            Chip chip = this.f20757v0;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            pVar.b(h.f4100e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.f27100D0);
    }
}

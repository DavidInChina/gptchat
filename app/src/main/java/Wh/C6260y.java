package B0;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: B0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0194k {

    /* renamed from: a  reason: collision with root package name */
    public final List f1652a;

    /* renamed from: b  reason: collision with root package name */
    public final C0189f f1653b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1654c;

    /* renamed from: d  reason: collision with root package name */
    public int f1655d;

    public C0194k(List list, C0189f c0189f) {
        MotionEvent motionEvent;
        int i10;
        MotionEvent motionEvent2;
        this.f1652a = list;
        this.f1653b = c0189f;
        MotionEvent motionEvent3 = null;
        if (c0189f != null) {
            motionEvent = c0189f.f1634b.f1687b;
        } else {
            motionEvent = null;
        }
        int i11 = 0;
        if (motionEvent != null) {
            i10 = motionEvent.getButtonState();
        } else {
            i10 = 0;
        }
        this.f1654c = i10;
        if (c0189f != null) {
            motionEvent2 = c0189f.f1634b.f1687b;
        } else {
            motionEvent2 = null;
        }
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        motionEvent3 = c0189f != null ? c0189f.f1634b.f1687b : motionEvent3;
        int i12 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i11 = 6;
                                break;
                            case 9:
                                i11 = 4;
                                break;
                            case 10:
                                i11 = 5;
                                break;
                        }
                        i12 = i11;
                    }
                    i11 = 3;
                    i12 = i11;
                }
                i11 = 2;
                i12 = i11;
            }
            i11 = 1;
            i12 = i11;
        } else {
            int size = list.size();
            while (true) {
                if (i11 < size) {
                    u uVar = (u) list.get(i11);
                    if (r9.y.Y(uVar)) {
                        i12 = 2;
                        break;
                    } else if (r9.y.W(uVar)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i12 = 3;
                    break;
                }
            }
        }
        this.f1655d = i12;
    }
}

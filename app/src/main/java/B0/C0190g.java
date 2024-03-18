package B0;

import H0.C0714y;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import q0.C5251c;

/* renamed from: B0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0190g {

    /* renamed from: a  reason: collision with root package name */
    public long f1636a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f1637b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f1638c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1639d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f1640e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f1641f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0154, code lost:
        if (r5 != 4) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(MotionEvent motionEvent, G g10) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        long j6;
        long j10;
        long j11;
        int toolType;
        int i14;
        char c10;
        int historySize;
        int i15;
        char c11;
        long j12;
        long a5;
        long x10;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f1637b;
        SparseBooleanArray sparseBooleanArray = this.f1638c;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f1640e || source != this.f1641f) {
                this.f1640e = toolType2;
                this.f1641f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j13 = 1;
        if (actionMasked2 != 0 && actionMasked2 != 5) {
            if (actionMasked2 == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j14 = this.f1636a;
                    this.f1636a = j14 + 1;
                    sparseLongArray.put(pointerId, j14);
                }
            }
        } else {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId2 = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j15 = this.f1636a;
                this.f1636a = j15 + 1;
                sparseLongArray.put(pointerId2, j15);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId2, true);
                }
            }
        }
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (actionMasked == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        if (actionMasked != i10) {
            if (actionMasked != 6) {
                i11 = -1;
            } else {
                i11 = motionEvent.getActionIndex();
            }
        } else {
            i11 = 0;
        }
        ArrayList arrayList = this.f1639d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i16 = 0;
        while (i16 < pointerCount) {
            if (!z10 && i16 != i11 && (!z11 || motionEvent.getButtonState() != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            int pointerId3 = motionEvent.getPointerId(i16);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z13 = z11;
                i13 = pointerCount;
                j6 = sparseLongArray.valueAt(indexOfKey);
            } else {
                long j16 = this.f1636a;
                z13 = z11;
                i13 = pointerCount;
                this.f1636a = j16 + j13;
                sparseLongArray.put(pointerId3, j16);
                j6 = j16;
            }
            float pressure = motionEvent.getPressure(i16);
            long r10 = R4.b.r(motionEvent.getX(i16), motionEvent.getY(i16));
            long a10 = C5251c.a(r10, 3);
            if (i16 == 0) {
                a5 = R4.b.r(motionEvent.getRawX(), motionEvent.getRawY());
                x10 = ((C0714y) g10).x(a5);
            } else if (Build.VERSION.SDK_INT >= 29) {
                a5 = C0191h.f1642a.a(motionEvent, i16);
                x10 = ((C0714y) g10).x(a5);
            } else {
                j10 = r10;
                j11 = ((C0714y) g10).n(r10);
                toolType = motionEvent.getToolType(i16);
                if (toolType == 0) {
                    if (toolType != 1) {
                        int i17 = 2;
                        if (toolType != 2) {
                            c10 = 3;
                            if (toolType != 3) {
                                i17 = 4;
                            }
                            i14 = i17;
                        } else {
                            c10 = 3;
                            i14 = 3;
                        }
                    } else {
                        c10 = 3;
                        i14 = 1;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i15 = 0; i15 < historySize; i15++) {
                        float historicalX = motionEvent.getHistoricalX(i16, i15);
                        float historicalY = motionEvent.getHistoricalY(i16, i15);
                        if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long r11 = R4.b.r(historicalX, historicalY);
                            arrayList2.add(new C0187d(motionEvent.getHistoricalEventTime(i15), r11, r11));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c11 = '\t';
                        j12 = R4.b.r(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c11 = '\t';
                        j12 = C5251c.f43619b;
                    }
                    arrayList.add(new x(j6, motionEvent.getEventTime(), j11, j10, z12, pressure, i14, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList2, j12, a10));
                    i16++;
                    z11 = z13;
                    pointerCount = i13;
                    j13 = 1;
                } else {
                    c10 = 3;
                }
                i14 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i15 < historySize) {
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                arrayList.add(new x(j6, motionEvent.getEventTime(), j11, j10, z12, pressure, i14, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList22, j12, a10));
                i16++;
                z11 = z13;
                pointerCount = i13;
                j13 = 1;
            }
            j11 = a5;
            j10 = x10;
            toolType = motionEvent.getToolType(i16);
            if (toolType == 0) {
            }
            i14 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i15 < historySize) {
            }
            if (motionEvent.getActionMasked() == 8) {
            }
            arrayList.add(new x(j6, motionEvent.getEventTime(), j11, j10, z12, pressure, i14, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList222, j12, a10));
            i16++;
            z11 = z13;
            pointerCount = i13;
            j13 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 != 1 && actionMasked3 != 6) {
            i12 = 0;
        } else {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i12 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i18 = i12;
                while (true) {
                    if (i18 < pointerCount2) {
                        if (motionEvent.getPointerId(i18) == keyAt) {
                            break;
                        }
                        i18++;
                    } else {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                }
            }
        }
        motionEvent.getEventTime();
        return new w(arrayList, motionEvent);
    }
}

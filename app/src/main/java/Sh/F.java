package Sh;

import yh.m1;

/* loaded from: classes2.dex */
public final class F extends m1 {
    @Override // yh.r, yh.l1
    public final String o() {
        String str = this.f51050i0;
        int max = Math.max(str.lastIndexOf(36), str.lastIndexOf(46));
        if (max != -1) {
            return str.substring(max + 1);
        }
        return str;
    }
}

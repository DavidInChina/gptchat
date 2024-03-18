package kf;

import id.AbstractC3557B;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class r extends AbstractC6583a {
    public static void J1(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void K1(List list, Comparator comparator) {
        AbstractC3557B.c0("<this>", list);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

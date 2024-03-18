package ng;

import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.P;
import Mf.a0;
import java.util.Comparator;

/* renamed from: ng.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4843j implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4843j f40349Y = new Object();

    public static int a(AbstractC1003l abstractC1003l) {
        if (AbstractC4838e.m(abstractC1003l)) {
            return 8;
        }
        if (abstractC1003l instanceof AbstractC1002k) {
            return 7;
        }
        if (abstractC1003l instanceof P) {
            if (((P) abstractC1003l).Z() == null) {
                return 6;
            }
            return 5;
        } else if (abstractC1003l instanceof AbstractC1013w) {
            if (((AbstractC1013w) abstractC1003l).Z() == null) {
                return 4;
            }
            return 3;
        } else if (abstractC1003l instanceof AbstractC0997f) {
            return 2;
        } else {
            if (abstractC1003l instanceof a0) {
                return 1;
            }
            return 0;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        AbstractC1003l abstractC1003l = (AbstractC1003l) obj;
        AbstractC1003l abstractC1003l2 = (AbstractC1003l) obj2;
        int a5 = a(abstractC1003l2) - a(abstractC1003l);
        if (a5 != 0) {
            num = Integer.valueOf(a5);
        } else if (AbstractC4838e.m(abstractC1003l) && AbstractC4838e.m(abstractC1003l2)) {
            num = 0;
        } else {
            int compareTo = abstractC1003l.getName().f37507Y.compareTo(abstractC1003l2.getName().f37507Y);
            if (compareTo != 0) {
                num = Integer.valueOf(compareTo);
            } else {
                num = null;
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}

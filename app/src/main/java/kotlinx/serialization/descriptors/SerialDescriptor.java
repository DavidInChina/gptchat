package kotlinx.serialization.descriptors;

import bh.AbstractC2223m;
import java.util.List;

/* loaded from: classes.dex */
public interface SerialDescriptor {
    String a();

    boolean c();

    int d(String str);

    AbstractC2223m e();

    int f();

    String g(int i10);

    List getAnnotations();

    List h(int i10);

    SerialDescriptor i(int i10);

    boolean isInline();

    boolean j(int i10);
}

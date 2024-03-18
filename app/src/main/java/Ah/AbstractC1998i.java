package ah;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ah.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface AbstractC1998i {
    Class with() default KSerializer.class;
}

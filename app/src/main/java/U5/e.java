package u5;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46426Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ File f46427Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(File file, int i10) {
        super(0);
        this.f46426Y = i10;
        this.f46427Z = file;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f46426Y;
        File file = this.f46427Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "Directory structure %s for writing last view event doesn't exist.", Arrays.copyOf(new Object[]{file.getParent()}, 1));
            case 1:
                return String.format(Locale.ENGLISH, "Unable to parse the file name as a timestamp: %s", Arrays.copyOf(new Object[]{file.getName()}, 1));
            case 2:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 3:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 4:
                return String.format(Locale.US, "Unable to write metadata file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 5:
                return R.a.r("Security exception was thrown for file ", file.getPath());
            case 6:
                return R.a.r("Unexpected exception was thrown for file ", file.getPath());
            case 7:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 8:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 9:
                return String.format(Locale.US, "Unable to move files; source directory does not exist: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 10:
                return String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 11:
                return String.format(Locale.US, "Unable to move files; could not create directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 12:
                return String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 13:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 14:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 15:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 16:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 17:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 18:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 19:
                return String.format(Locale.US, "The file provided is not a batch file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 20:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 21:
                return String.format(Locale.US, "File %s is probably corrupted, not all content was read.", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 22:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            default:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
        }
    }
}

package com.github.zxh.classpy.classfile.cp;

import com.github.zxh.classpy.classfile.ClassReader;
import com.github.zxh.classpy.classfile.U4;

/**
 *
 * @author zxh
 */
public class ConstantDoubleInfo extends ConstantInfo {

    private U4 highBytes;
    private U4 lowBytes;
    private double value;
    
    @Override
    public void readInfo(ClassReader reader) {
        value = reader.getByteBuffer().getDouble(reader.position());
        highBytes = reader.readU4();
        lowBytes = reader.readU4();
    }
    
}